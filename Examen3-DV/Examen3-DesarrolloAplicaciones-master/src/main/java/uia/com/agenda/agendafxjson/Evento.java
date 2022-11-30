package uia.com.agenda.agendafxjson;

public class Evento extends InfoAgenda{
    private String fechaEvento="";



    private String tipo1="";

    public Evento(int id, String fechaEvento, String name, String fecha, String email, String telefono) {
        super(id, name, fecha);
        this.fechaEvento=fechaEvento;
    }

    public Evento() {
    }

    public Evento(EventoDTO eventoDTO)
    {
        super(eventoDTO.getId(), eventoDTO.getName(),eventoDTO.getFecha());
        this.fechaEvento=eventoDTO.getFechaEvento();
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }
}




