
package modelo;


public class mdAlumno {

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the idtele
     */
    public String getIdtele() {
        return idtele;
    }

    /**
     * @param idtele the idtele to set
     */
    public void setIdtele(String idtele) {
        this.idtele = idtele;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    private String nombre,correo,idtele,carnet;
    private double media, mediana, moda, rango, desviacion2;
    private String sexo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    /**
     * @return the mediana
     */
    public double getMediana() {
        return mediana;
    }

    /**
     * @param mediana the mediana to set
     */
    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    /**
     * @return the moda
     */
    public double getModa() {
        return moda;
    }

    /**
     * @param moda the moda to set
     */
    public void setModa(double moda) {
        this.moda = moda;
    }

    /**
     * @return the rango
     */
    public double getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(double rango) {
        this.rango = rango;
    }

    /**
     * @return the desviacion2
     */
    public double getDesviacion2() {
        return desviacion2;
    }

    /**
     * @param desviacion2 the desviacion2 to set
     */
    public void setDesviacion2(double desviacion2) {
        this.desviacion2 = desviacion2;
    }
}
