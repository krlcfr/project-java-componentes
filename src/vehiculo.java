//Vehiculo, identificación, marca, modelo, etc.
public class vehiculo {
    //atributos de la clase vehiculo
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    //atributos de otras clases
    private motor motor;
    private transmision transmision;
    private chasis chasis;
    private neumatico neumatico;
    private sistemaFrenos sistemaFrenos;
    private sistemaElectrico sistemaElectrico;
    private registroVehicular registroVehicular;
    private mantenimiento mantenimiento;
    private sensor sensor;

    //añadir metodo constructor
    public vehiculo(String marca, String modelo, String matricula, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
    }

    //Todo: geters
    public String getMarca(){ return marca;}
    public String getModelo(){ return modelo;}
    public String getMatricula(){return matricula;}
    public int getAnio(){return anio;}


    //Todo: setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(transmision transmision) {
        this.transmision = transmision;
    }

    public chasis getChasis() {
        return chasis;
    }

    public void setChasis(chasis chasis) {
        this.chasis = chasis;
    }

    public neumatico getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(neumatico neumatico) {
        this.neumatico = neumatico;
    }

    public sistemaFrenos getSistemaFrenos() {
        return sistemaFrenos;
    }

    public void setSistemaFrenos(sistemaFrenos sistemaFrenos) {
        this.sistemaFrenos = sistemaFrenos;
    }

    public sistemaElectrico getSistemaElectrico() {
        return sistemaElectrico;
    }

    public void setSistemaElectrico(sistemaElectrico sistemaElectrico) {
        this.sistemaElectrico = sistemaElectrico;
    }

    public registroVehicular getRegistroVehicular() {
        return registroVehicular;
    }

    public void setRegistroVehicular(registroVehicular registroVehicular) {
        this.registroVehicular = registroVehicular;
    }

    public mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public sensor getSensor() {
        return sensor;
    }

    public void setSensor(sensor sensor) {
        this.sensor = sensor;
    }
}