/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author Notandi
 */
public class TripResult extends javax.swing.JPanel {

    /**
     * Creates new form TripResult
     */
    public TripResult() {
        initComponents();
    }
    
    public javax.swing.JPanel getPersonal_info_panel() {
        return personal_info;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        personal_info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hotelName = new javax.swing.JLabel();
        hotelAddress = new javax.swing.JLabel();
        hotelRating = new javax.swing.JLabel();
        hotelPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        outbound_flightNo = new javax.swing.JLabel();
        outbound_airline = new javax.swing.JLabel();
        oubound_departure = new javax.swing.JLabel();
        outbound_departureTime = new javax.swing.JLabel();
        outbound_arrival = new javax.swing.JLabel();
        outbound_arrivalTime = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        inbound_flightNo = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        inbound_airline = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        inbound_departure = new javax.swing.JLabel();
        inbound_departureTime = new javax.swing.JLabel();
        inbound_arrival = new javax.swing.JLabel();
        inbound_arrivaltime = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        flight_totalPrice = new javax.swing.JLabel();
        personal_info1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        customerEmail = new javax.swing.JLabel();
        customerPhone = new javax.swing.JLabel();
        customerAddress = new javax.swing.JLabel();
        personal_info2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daytour_list = new javax.swing.JList<>();
        package_price = new javax.swing.JLabel();

        personal_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Name: ");
        personal_info.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("Address:");
        personal_info.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Price:");
        personal_info.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 84, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Rating:");
        personal_info.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hotel-dark-icon-40.png"))); // NOI18N
        jLabel5.setText("  Your hotel");
        personal_info.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        hotelName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hotelName.setText("Stjörnuþoka");
        personal_info.add(hotelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 104, 400, -1));

        hotelAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hotelAddress.setText("geimsteinn@stjarna.is");
        personal_info.add(hotelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 133, 400, -1));

        hotelRating.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        personal_info.add(hotelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 165, 400, 20));

        hotelPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hotelPrice.setText("Sprengistjarna 88");
        personal_info.add(hotelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 196, 400, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/airplane-shape-40.png"))); // NOI18N
        jLabel10.setText("  Your flights");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 179, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 51, 0));
        jLabel11.setText("Outbound flight");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Flight number:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Airline:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Departure");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Arrival");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        outbound_flightNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outbound_flightNo.setText("jLabel17");
        jPanel2.add(outbound_flightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        outbound_airline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outbound_airline.setText("jLabel18");
        jPanel2.add(outbound_airline, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        oubound_departure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oubound_departure.setText("jLabel19");
        jPanel2.add(oubound_departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        outbound_departureTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outbound_departureTime.setText("jLabel20");
        jPanel2.add(outbound_departureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        outbound_arrival.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outbound_arrival.setText("jLabel12");
        jPanel2.add(outbound_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        outbound_arrivalTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outbound_arrivalTime.setText("jLabel30");
        jPanel2.add(outbound_arrivalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Flight number:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        inbound_flightNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_flightNo.setText("jLabel17");
        jPanel2.add(inbound_flightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 51, 0));
        jLabel33.setText("Inbound flight");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Airline:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        inbound_airline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_airline.setText("jLabel18");
        jPanel2.add(inbound_airline, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Departure");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        inbound_departure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_departure.setText("jLabel19");
        jPanel2.add(inbound_departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        inbound_departureTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_departureTime.setText("jLabel20");
        jPanel2.add(inbound_departureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        inbound_arrival.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_arrival.setText("jLabel12");
        jPanel2.add(inbound_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        inbound_arrivaltime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inbound_arrivaltime.setText("jLabel30");
        jPanel2.add(inbound_arrivaltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Arrival");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 51, 0));
        jLabel21.setText("Total price: ");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        flight_totalPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flight_totalPrice.setText("jLabel22");
        jPanel2.add(flight_totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 545, 100, -1));

        personal_info1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 51, 0));
        jLabel23.setText("Name: ");
        personal_info1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 85, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 51, 0));
        jLabel24.setText("Email:");
        personal_info1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 117, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 51, 0));
        jLabel25.setText("Addresss");
        personal_info1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 181, 84, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 51, 0));
        jLabel26.setText("Phone:");
        personal_info1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 149, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/personal.png"))); // NOI18N
        jLabel27.setText("  Your information");
        personal_info1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 27, -1, -1));

        customerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerName.setText("Stjörnuþoka");
        personal_info1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 91, 400, -1));

        customerEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerEmail.setText("geimsteinn@stjarna.is");
        personal_info1.add(customerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 123, 400, -1));

        customerPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerPhone.setText("888 2221");
        personal_info1.add(customerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 155, 400, -1));

        customerAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerAddress.setText("Sprengistjarna 88");
        personal_info1.add(customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 187, 400, -1));

        personal_info2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/day-tour-dark-icon-40.png"))); // NOI18N
        jLabel48.setText("  Your day tours");
        personal_info2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        daytour_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        daytour_list.setFixedCellHeight(80);
        daytour_list.setOpaque(false);
        daytour_list.setVisibleRowCount(-1);
        jScrollPane1.setViewportView(daytour_list);
        daytour_list.setBorder(BorderFactory.createEmptyBorder());
        daytour_list.setBackground(new Color(0,0,0,0));

        personal_info2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 88, 1033, 421));
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(7,7));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());

        package_price.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        package_price.setForeground(new java.awt.Color(153, 51, 0));
        package_price.setText("Package price:   800.000 ISK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personal_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(personal_info, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(personal_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(package_price, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(personal_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(personal_info, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(personal_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(package_price, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerAddress;
    private javax.swing.JLabel customerEmail;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel customerPhone;
    private javax.swing.JList<String> daytour_list;
    private javax.swing.JLabel flight_totalPrice;
    private javax.swing.JLabel hotelAddress;
    private javax.swing.JLabel hotelName;
    private javax.swing.JLabel hotelPrice;
    private javax.swing.JLabel hotelRating;
    private javax.swing.JLabel inbound_airline;
    private javax.swing.JLabel inbound_arrival;
    private javax.swing.JLabel inbound_arrivaltime;
    private javax.swing.JLabel inbound_departure;
    private javax.swing.JLabel inbound_departureTime;
    private javax.swing.JLabel inbound_flightNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel oubound_departure;
    private javax.swing.JLabel outbound_airline;
    private javax.swing.JLabel outbound_arrival;
    private javax.swing.JLabel outbound_arrivalTime;
    private javax.swing.JLabel outbound_departureTime;
    private javax.swing.JLabel outbound_flightNo;
    private javax.swing.JLabel package_price;
    private javax.swing.JPanel personal_info;
    private javax.swing.JPanel personal_info1;
    private javax.swing.JPanel personal_info2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getCustomerAddress() {
        return customerAddress;
    }

    public javax.swing.JLabel getCustomerEmail() {
        return customerEmail;
    }

    public javax.swing.JLabel getCustomerName() {
        return customerName;
    }

    public javax.swing.JLabel getCustomerPhone() {
        return customerPhone;
    }

    public javax.swing.JList<String> getDaytour_list() {
        return daytour_list;
    }

    public javax.swing.JLabel getFlight_totalPrice() {
        return flight_totalPrice;
    }

    public javax.swing.JLabel getHotelAddress() {
        return hotelAddress;
    }

    public javax.swing.JLabel getHotelName() {
        return hotelName;
    }

    public javax.swing.JLabel getHotelPrice() {
        return hotelPrice;
    }

    public javax.swing.JLabel getHotelRating() {
        return hotelRating;
    }

    public javax.swing.JLabel getInbound_airline() {
        return inbound_airline;
    }

    public javax.swing.JLabel getInbound_arrival() {
        return inbound_arrival;
    }

    public javax.swing.JLabel getInbound_arrivalTime() {
        return inbound_arrivaltime;
    }

    public javax.swing.JLabel getInbound_departure() {
        return inbound_departure;
    }

    public javax.swing.JLabel getInbound_departureTime() {
        return inbound_departureTime;
    }

    public javax.swing.JLabel getInbound_flightNo() {
        return inbound_flightNo;
    }

    public javax.swing.JLabel getOubound_departure() {
        return oubound_departure;
    }

    public javax.swing.JLabel getOutbound_airline() {
        return outbound_airline;
    }

    public javax.swing.JLabel getOutbound_arrival() {
        return outbound_arrival;
    }

    public javax.swing.JLabel getOutbound_arrivalTime() {
        return outbound_arrivalTime;
    }

    public javax.swing.JLabel getOutbound_departureTime() {
        return outbound_departureTime;
    }

    public javax.swing.JLabel getOutbound_flightNo() {
        return outbound_flightNo;
    }

    public javax.swing.JLabel getPackage_price() {
        return package_price;
    }
}
