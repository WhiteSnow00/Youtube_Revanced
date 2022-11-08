import com.google.protos.youtube.api.innertube.GeoSearchDetailsRendererOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjb extends aclr
{
    private final acjb a;
    
    public jjb(final anvw anvw) {
        final acjb a = new acjb();
        this.a = a;
        anss anss;
        if ((anss = anvw.b) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer)) {
            anss anss2;
            if ((anss2 = anvw.b) == null) {
                anss2 = anss.a;
            }
            a.add(((agzd)anss2).rr((agyr)GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer));
        }
    }
    
    public final achk a() {
        return (achk)this.a;
    }
}
