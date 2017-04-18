package src;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author npquy
 */
public class HotelResult extends javax.swing.JPanel {

    /** Creates new form TourResult */
    public HotelResult() {
        initComponents();
        //setBackground(new java.awt.Color(0,0,0,0));
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        hotelName = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        see_more_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_images/hotel_holt.png"))); // NOI18N
        image.setText("jLabel1");

        address.setFont(new java.awt.Font("Malayalam MN", 0, 11)); // NOI18N
        address.setText("Aðalstræti 13");

        hotelName.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        hotelName.setText("Hotel Holt");

        rating.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_images/5_stars.png"))); // NOI18N

        see_more_label.setBackground(new java.awt.Color(204, 204, 204));
        see_more_label.setText("See more");
        see_more_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        see_more_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        see_more_label.setOpaque(true);
        see_more_label.setHorizontalAlignment(JLabel.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotelName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(see_more_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(hotelName)
                        .addGap(0, 0, 0)
                        .addComponent(address)
                        .addGap(4, 4, 4)
                        .addComponent(rating)
                        .addGap(11, 11, 11)
                        .addComponent(see_more_label)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel hotelName;
    private javax.swing.JLabel image;
    private javax.swing.JLabel rating;
    private javax.swing.JLabel see_more_label;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getAddress() {
        return address;
    }

    public javax.swing.JLabel getHotelName() {
        return hotelName;
    }

    public javax.swing.JLabel getImage() {
        return image;
    }

    public javax.swing.JLabel getRating() {
        return rating;
    }

    public javax.swing.JLabel getSee_more_label() {
        return see_more_label;
    }

}
