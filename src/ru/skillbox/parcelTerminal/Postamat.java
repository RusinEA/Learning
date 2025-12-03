package ru.skillbox.parcelTerminal;

import ru.skillbox.parcelTerminal.packages.Shipment;
import ru.skillbox.parcelTerminal.cell.PostCell;

import java.math.BigDecimal;

public class Postamat {

    private final PostCell[] postCells;

    public Postamat(PostCell[] postCells) {
        this.postCells = postCells;
    }

    public Integer putShipment (Shipment shipment) {
        for (int i = 0; i < postCells.length; i++) {
            PostCell cell = postCells[i];
            if (cell.canAcceptShipment(shipment)) {
                boolean isPutSuccess = cell.putShipment(shipment);
                if(isPutSuccess){
                    System.out.println("Посылка размещена в ячейке");
                }
                return i;
            }
        }
        System.out.println("Нет подходящей ячейки");
        return null;
    }

    public Shipment getShipment(int numberOfCell) {
        if (numberOfCell < 0 || numberOfCell > postCells.length) {
            System.out.println("Ячейки с этим номером не найдено");
        }
        return postCells[numberOfCell].extractShipment();
    }

    public BigDecimal weightAllShipments() {
        BigDecimal weightAll = BigDecimal.valueOf(0);
        for (PostCell cell : postCells) {
            if (cell.hasShipment()) {
                weightAll = weightAll.add(cell.shipmentWeight());
            }
        }
        return weightAll;
    }

}
