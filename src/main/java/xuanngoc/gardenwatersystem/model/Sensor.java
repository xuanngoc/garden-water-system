package xuanngoc.gardenwatersystem.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private SensorType sensorType;

    @OneToOne(cascade = CascadeType.ALL)
    private Device device;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SensorValue> sensorValue;

    private String name;
    private String status;
    private Boolean state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
