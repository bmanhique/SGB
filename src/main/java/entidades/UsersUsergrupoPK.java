/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Manhique
 */
@Embeddable
public class UsersUsergrupoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "data_alocacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAlocacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "users_utilizador", nullable = false, length = 255)
    private String usersUtilizador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "utilizador", nullable = false, length = 255)
    private String utilizador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "id_grupo", nullable = false, length = 255)
    private String idGrupo;

    public UsersUsergrupoPK() {
    }

    public UsersUsergrupoPK(Date dataAlocacao, String usersUtilizador, String utilizador, String idGrupo) {
        this.dataAlocacao = dataAlocacao;
        this.usersUtilizador = usersUtilizador;
        this.utilizador = utilizador;
        this.idGrupo = idGrupo;
    }

    public Date getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(Date dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public String getUsersUtilizador() {
        return usersUtilizador;
    }

    public void setUsersUtilizador(String usersUtilizador) {
        this.usersUtilizador = usersUtilizador;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataAlocacao != null ? dataAlocacao.hashCode() : 0);
        hash += (usersUtilizador != null ? usersUtilizador.hashCode() : 0);
        hash += (utilizador != null ? utilizador.hashCode() : 0);
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersUsergrupoPK)) {
            return false;
        }
        UsersUsergrupoPK other = (UsersUsergrupoPK) object;
        if ((this.dataAlocacao == null && other.dataAlocacao != null) || (this.dataAlocacao != null && !this.dataAlocacao.equals(other.dataAlocacao))) {
            return false;
        }
        if ((this.usersUtilizador == null && other.usersUtilizador != null) || (this.usersUtilizador != null && !this.usersUtilizador.equals(other.usersUtilizador))) {
            return false;
        }
        if ((this.utilizador == null && other.utilizador != null) || (this.utilizador != null && !this.utilizador.equals(other.utilizador))) {
            return false;
        }
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.UsersUsergrupoPK[ dataAlocacao=" + dataAlocacao + ", usersUtilizador=" + usersUtilizador + ", utilizador=" + utilizador + ", idGrupo=" + idGrupo + " ]";
    }
    
}
