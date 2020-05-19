package clase2;

public class PlanTelefonico {
	private Integer gb;
	private Integer minutos;
	private Integer sms;
	private String nombre;
	// por defecto
	public PlanTelefonico() {
		this.gb = 1;
		this.minutos = 100;
		this.sms = 10000;
		this.nombre = "base";
	}
	// parametrizado
	public PlanTelefonico(Integer gb, Integer minutos, Integer sms, String nombre) {
		super();
		this.gb = gb;
		this.minutos = minutos;
		this.sms = sms;
		this.nombre = nombre;
	}

	public Integer getGb() {
		return gb;
	}

	public void setGb(Integer gb) {
		this.gb = gb;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSms() {
		return sms;
	}

	public void setSms(Integer sms) {
		this.sms = sms;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PlanTelefonico [gb=" + gb + ", minutos=" + minutos + ", sms=" + sms + ", nombre=" + nombre + "]";
	}

	// ALT+SHIFT+S

	// DESTRUCTOR
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.gb = null;
		this.minutos = null;
		this.nombre = null;
	}
}
