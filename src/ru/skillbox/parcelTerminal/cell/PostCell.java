package ru.skillbox.parcelTerminal.cell;

import ru.skillbox.parcelTerminal.dimensions.Dimensions;
import ru.skillbox.parcelTerminal.packages.Shipment;

import java.math.BigDecimal;

public class PostCell {
    private final Dimensions dimensions;
    private Status status;
    private Shipment shipment;
    private java.math.BigDecimal weight;

    public PostCell(Dimensions dimensions) {
        this.dimensions = dimensions;
        this.status = Status.WORK;
    }

    public BigDecimal shipmentWeight() {
        return shipment.weight();
    }

    public boolean hasShipment(){
        return shipment != null;
    }

    public boolean canAcceptShipment(Shipment shipment) {
        if (hasShipment()) {
            return false;
        }
        if (status != Status.WORK) {
            return false;
        }
        return this.dimensions.canItFit(shipment.dimensions());

    }

    public boolean putShipment(Shipment shipment) {
        if (canAcceptShipment(shipment)){
            this.shipment = shipment;
            // System.out.println(TODO) /*сделать возврат индекса/*;
        } else {
            System.out.println("Данная ячейка занята");
        }
        return false;
    }

    public Shipment extractShipment(){
        var extractedShipment = this.shipment;
        this.shipment = null;
        return extractedShipment;
    }

    public void turnMaintenanceMode() {
        if (hasShipment()) {
            System.out.println("Ячейка не пуста, включить обслуживание не получится");
            return;
        } else {
            status = Status.AT_MAINTENANCE;
        }
    }

    public void turnWorkingMode() {
        this.status = Status.WORK;
    }

}
