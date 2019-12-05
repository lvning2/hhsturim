package rebotstudio.hhsturim.entity;

import java.util.Date;

public class Contract {
    private Integer id;

    private Integer partya;

    private Integer partyb;

    private Date contractstarttime;

    private Date contractendtime;

    private Integer state;

    private String contractcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartya() {
        return partya;
    }

    public void setPartya(Integer partya) {
        this.partya = partya;
    }

    public Integer getPartyb() {
        return partyb;
    }

    public void setPartyb(Integer partyb) {
        this.partyb = partyb;
    }

    public Date getContractstarttime() {
        return contractstarttime;
    }

    public void setContractstarttime(Date contractstarttime) {
        this.contractstarttime = contractstarttime;
    }

    public Date getContractendtime() {
        return contractendtime;
    }

    public void setContractendtime(Date contractendtime) {
        this.contractendtime = contractendtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContractcontent() {
        return contractcontent;
    }

    public void setContractcontent(String contractcontent) {
        this.contractcontent = contractcontent == null ? null : contractcontent.trim();
    }
}