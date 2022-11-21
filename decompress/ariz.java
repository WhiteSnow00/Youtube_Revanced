import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ariz implements Cloneable
{
    public String a;
    public long b;
    public Date c;
    public Date d;
    public arkx e;
    public double f;
    public double g;
    public float h;
    public long i;
    public int j;
    
    public ariz() {
        this.a = "eng";
        this.c = new Date();
        this.d = new Date();
        this.e = arkx.a;
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
