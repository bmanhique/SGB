/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manhique
 */
@Entity
@Table(name = "bv_artigo_categoria", catalog = "bh", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BvArtigoCategoria.findAll", query = "SELECT b FROM BvArtigoCategoria b")
    , @NamedQuery(name = "BvArtigoCategoria.findByCategoria", query = "SELECT b FROM BvArtigoCategoria b WHERE b.categoria = :categoria")
    , @NamedQuery(name = "BvArtigoCategoria.findByDescricao", query = "SELECT b FROM BvArtigoCategoria b WHERE b.descricao = :descricao")})
public class BvArtigoCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "categoria", nullable = false, length = 64)
    private String categoria;
    @Size(max = 255)
    @Column(name = "descricao", length = 255)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea", fetch = FetchType.LAZY)
    private List<BvAvaliador> bvAvaliadorList;
    @OneToMany(mappedBy = "tipodoc", fetch = FetchType.LAZY)
    private List<BvArtigo> bvArtigoList;

    public BvArtigoCategoria() {
    }

    public BvArtigoCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<BvAvaliador> getBvAvaliadorList() {
        return bvAvaliadorList;
    }

    public void setBvAvaliadorList(List<BvAvaliador> bvAvaliadorList) {
        this.bvAvaliadorList = bvAvaliadorList;
    }

    @XmlTransient
    public List<BvArtigo> getBvArtigoList() {
        return bvArtigoList;
    }

    public void setBvArtigoList(List<BvArtigo> bvArtigoList) {
        this.bvArtigoList = bvArtigoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoria != null ? categoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BvArtigoCategoria)) {
            return false;
        }
        BvArtigoCategoria other = (BvArtigoCategoria) object;
        if ((this.categoria == null && other.categoria != null) || (this.categoria != null && !this.categoria.equals(other.categoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.BvArtigoCategoria[ categoria=" + categoria + " ]";
    }
    
}
