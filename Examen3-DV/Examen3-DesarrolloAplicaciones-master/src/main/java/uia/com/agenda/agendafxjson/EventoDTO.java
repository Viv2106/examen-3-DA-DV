package uia.com.agenda.agendafxjson;

public class EventoDTO extends InfoAgenda{

    private String tipo1;
    private String fechaEvento;


    public EventoDTO(String tipo1, String name, String fechaEvento, String fecha) {
        super(-1, name, fecha);
        this.tipo1 = tipo1;
        this.fechaEvento = fechaEvento;
    }

    public EventoDTO() {
    }

    public EventoDTO(InfoAgenda infoAgenda)
    {
        this.setName(infoAgenda.getName());
        this.setFecha(infoAgenda.getFecha());
    }


    public String getFechaEvento() {
        return fechaEvento;
    }


    public String getTipo1() {
        return tipo1;
    }


    public void setTipo1(String text) {
        this.tipo1 = text;

    }

    public void setFechaEvento(String text) {
        this.fechaEvento = text;

    }

    public String getname() {
        return super.getName();
    }

    public void setname(String text) {
        super.setName(text);
    }

}
