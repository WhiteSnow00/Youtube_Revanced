import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardq implements Cloneable
{
    public String a;
    public long b;
    public Date c;
    public Date d;
    public arfo e;
    public double f;
    public double g;
    public float h;
    public long i;
    public int j;
    
    public ardq() {
        this.a = "eng";
        this.c = new Date();
        this.d = new Date();
        this.e = arfo.a;
        this.i = 1L;
    }
    
    public final Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
}
