package geniets.android.soap;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.6.0
//
// Created by Quasar Development at 19/06/2016
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class Trimestre extends AttributeContainer implements KvmSerializable
{

    
    public String abrege;
    
    public String auLong;
    
    public String dateDebut;
    
    public String dateFin;
    
    public String dateFinCours;
    
    public String dateDebutChemiNot;
    
    public String dateFinChemiNot;
    
    public String dateDebutAnnulationAvecRemboursement;
    
    public String dateFinAnnulationAvecRemboursement;
    
    public String dateFinAnnulationAvecRemboursementNouveauxEtudiants;
    
    public String dateDebutAnnulationSansRemboursementNouveauxEtudiants;
    
    public String dateFinAnnulationSansRemboursementNouveauxEtudiants;
    
    public String dateLimitePourAnnulerASEQ;

    public Trimestre ()
    {
    }

    public Trimestre (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("abrege"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.abrege = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.abrege = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("auLong"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.auLong = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.auLong = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateDebut"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateDebut = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateDebut = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFin"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFin = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFin = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFinCours"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFinCours = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFinCours = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateDebutChemiNot"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateDebutChemiNot = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateDebutChemiNot = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFinChemiNot"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFinChemiNot = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFinChemiNot = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateDebutAnnulationAvecRemboursement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateDebutAnnulationAvecRemboursement = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateDebutAnnulationAvecRemboursement = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFinAnnulationAvecRemboursement"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFinAnnulationAvecRemboursement = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFinAnnulationAvecRemboursement = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFinAnnulationAvecRemboursementNouveauxEtudiants"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFinAnnulationAvecRemboursementNouveauxEtudiants = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFinAnnulationAvecRemboursementNouveauxEtudiants = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateDebutAnnulationSansRemboursementNouveauxEtudiants"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateDebutAnnulationSansRemboursementNouveauxEtudiants = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateDebutAnnulationSansRemboursementNouveauxEtudiants = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateFinAnnulationSansRemboursementNouveauxEtudiants"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateFinAnnulationSansRemboursementNouveauxEtudiants = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateFinAnnulationSansRemboursementNouveauxEtudiants = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateLimitePourAnnulerASEQ"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateLimitePourAnnulerASEQ = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateLimitePourAnnulerASEQ = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.abrege!=null?this.abrege:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.auLong!=null?this.auLong:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.dateDebut!=null?this.dateDebut:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.dateFin!=null?this.dateFin:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.dateFinCours!=null?this.dateFinCours:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.dateDebutChemiNot!=null?this.dateDebutChemiNot:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.dateFinChemiNot!=null?this.dateFinChemiNot:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.dateDebutAnnulationAvecRemboursement!=null?this.dateDebutAnnulationAvecRemboursement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.dateFinAnnulationAvecRemboursement!=null?this.dateFinAnnulationAvecRemboursement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.dateFinAnnulationAvecRemboursementNouveauxEtudiants!=null?this.dateFinAnnulationAvecRemboursementNouveauxEtudiants:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.dateDebutAnnulationSansRemboursementNouveauxEtudiants!=null?this.dateDebutAnnulationSansRemboursementNouveauxEtudiants:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.dateFinAnnulationSansRemboursementNouveauxEtudiants!=null?this.dateFinAnnulationSansRemboursementNouveauxEtudiants:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.dateLimitePourAnnulerASEQ!=null?this.dateLimitePourAnnulerASEQ:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 13;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "abrege";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "auLong";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateDebut";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFin";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFinCours";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateDebutChemiNot";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFinChemiNot";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateDebutAnnulationAvecRemboursement";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFinAnnulationAvecRemboursement";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFinAnnulationAvecRemboursementNouveauxEtudiants";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateDebutAnnulationSansRemboursementNouveauxEtudiants";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateFinAnnulationSansRemboursementNouveauxEtudiants";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateLimitePourAnnulerASEQ";
            info.namespace= "http://etsmtl.ca/";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
