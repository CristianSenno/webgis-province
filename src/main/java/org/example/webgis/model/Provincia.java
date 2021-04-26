package org.example.webgis.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.locationtech.jts.geom.Geometry;

@Entity
public class Provincia {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    @Column(
        columnDefinition = "SERIAL"
    )
    private Integer id;
    private Long codRip;
    private Long codReg;
    private Long codProv;
    private Long codCm;
    private Long codUts;
    private String denProv;
    private String denCm;
    private String denUts;
    private String sigla;
    private String tipoUts;
    private BigDecimal shapeArea;
    private BigDecimal shapeLen;
    private Geometry geom;

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCodRip() {
        return codRip;
    }

    public void setCodRip(Long codRip) {
        this.codRip = codRip;
    }

    public Long getCodReg() {
        return codReg;
    }

    public void setCodReg(Long codReg) {
        this.codReg = codReg;
    }

    public Long getCodProv() {
        return codProv;
    }

    public void setCodProv(Long codProv) {
        this.codProv = codProv;
    }

    public Long getCodCm() {
        return codCm;
    }

    public void setCodCm(Long codCm) {
        this.codCm = codCm;
    }

    public Long getCodUts() {
        return codUts;
    }

    public void setCodUts(Long codUts) {
        this.codUts = codUts;
    }

    public String getDenProv() {
        return denProv;
    }

    public void setDenProv(String denProv) {
        this.denProv = denProv;
    }

    public String getDenCm() {
        return denCm;
    }

    public void setDenCm(String denCm) {
        this.denCm = denCm;
    }

    public String getDenUts() {
        return denUts;
    }

    public void setDenUts(String denUts) {
        this.denUts = denUts;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoUts() {
        return tipoUts;
    }

    public void setTipoUts(String tipoUts) {
        this.tipoUts = tipoUts;
    }

    public Geometry getGeom() {
        return geom;
    }

    public void setGeom(Geometry geom) {
        this.geom = geom;
    }

    public BigDecimal getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(BigDecimal shapeArea) {
        this.shapeArea = shapeArea;
    }

    public BigDecimal getShapeLen() {
        return shapeLen;
    }

    public void setShapeLen(BigDecimal shapeLen) {
        this.shapeLen = shapeLen;
    }

    public Map<String, Object> getPropertyMap() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", this.getId());
        map.put("codRip", this.getCodRip());
        map.put("codReg", this.getCodReg());
        map.put("codProv", this.getCodProv());
        map.put("codCm", this.getCodCm());
        map.put("codUts", this.getCodUts());
        map.put("denProv", this.getDenProv());
        map.put("denCm", this.getDenCm());
        map.put("denUts", this.getDenUts());
        map.put("sigla", this.getSigla());
        map.put("tipoUts", this.getTipoUts());
        map.put("shapeArea", this.getShapeArea());
        map.put("shapeLen", this.getShapeLen());
        
        // TODO complete this mapping
        return map;
    }
    
    

}
