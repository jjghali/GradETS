package geniets.android.soap;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.6.0
//
// Created by Quasar Development at 19/06/2016
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class ArrayOfElementEvaluation extends Vector< ElementEvaluation> implements KvmSerializable
{
    
    public ArrayOfElementEvaluation(){}
    
    public ArrayOfElementEvaluation(java.lang.Object inObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                ElementEvaluation j1= (ElementEvaluation)__envelope.get(j,ElementEvaluation.class);
                add(j1);
            }
        }
}
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "ElementEvaluation";
        info.type = ElementEvaluation.class;
    	info.namespace= "http://etsmtl.ca/";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

}