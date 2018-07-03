/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manhique
 */
@Entity
@Table(name = "sg_obra_sg_exemplar", catalog = "bh", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SgObraSgExemplar.findAll", query = "SELECT s FROM SgObraSgExemplar s")
    , @NamedQuery(name = "SgObraSgExemplar.findBySgobraIdlivro", query = "SELECT s FROM SgObraSgExemplar s WHERE s.sgObraSgExemplarPK.sgobraIdlivro = :sgobraIdlivro")
    , @NamedQuery(name = "SgObraSgExemplar.findBySgexemplarlistNrRegisto", query = "SELECT s FROM SgObraSgExemplar s WHERE s.sgObraSgExemplarPK.sgexemplarlistNrRegisto = :sgexemplarlistNrRegisto")
    , @NamedQuery(name = "SgObraSgExemplar.findByGetsgexemplarlistNrRegisto", query = "SELECT s FROM SgObraSgExemplar s WHERE s.sgObraSgExemplarPK.getsgexemplarlistNrRegisto = :getsgexemplarlistNrRegisto")})
public class SgObraSgExemplar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SgObraSgExemplarPK sgObraSgExemplarPK;

    public SgObraSgExemplar() {
    }

    public SgObraSgExemplar(SgObraSgExemplarPK sgObraSgExemplarPK) {
        this.sgObraSgExemplarPK = sgObraSgExemplarPK;
    }

    public SgObraSgExemplar(long sgobraIdlivro, long sgexemplarlistNrRegisto, long getsgexemplarlistNrRegisto) {
        this.sgObraSgExemplarPK = new SgObraSgExemplarPK(sgobraIdlivro, sgexemplarlistNrRegisto, getsgexemplarlistNrRegisto);
    }

    public SgObraSgExemplarPK getSgObraSgExemplarPK() {
        return sgObraSgExemplarPK;
    }

    public void setSgObraSgExemplarPK(SgObraSgExemplarPK sgObraSgExemplarPK) {
        this.sgObraSgExemplarPK = sgObraSgExemplarPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sgObraSgExemplarPK != null ? sgObraSgExemplarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgObraSgExemplar)) {
            return false;
        }
        SgObraSgExemplar other = (SgObraSgExemplar) object;
        if ((this.sgObraSgExemplarPK == null && other.sgObraSgExemplarPK != null) || (this.sgObraSgExemplarPK != null && !this.sgObraSgExemplarPK.equals(other.sgObraSgExemplarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SgObraSgExemplar[ sgObraSgExemplarPK=" + sgObraSgExemplarPK + " ]";
    }
    
}
