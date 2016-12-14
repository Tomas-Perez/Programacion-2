package RecuperatorioContainers;

public class Container {
    private int code;
    private String description;
    private int clientCode;

    public Container(int code, String description, int clientCode) {
        this.code = code;
        this.description = description;
        this.clientCode = clientCode;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getClientCode() {
        return clientCode;
    }

    @Override
    public String toString() {
        return "{ " +
                "code = " + code +
                ", description = '" + description + '\'' +
                ", clientCode = " + clientCode +
                " }";
    }
}
