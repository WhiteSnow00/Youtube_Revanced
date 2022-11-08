import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oef implements arjd
{
    private final atjj a;
    
    public oef(final atjj a) {
        this.a = a;
    }
    
    public static oee c(final Map map) {
        final int size = map.size();
        Object o;
        if (size != 0) {
            if (size != 1) {
                throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
            }
            o = adwd.aL(map.keySet());
        }
        else {
            o = new odt();
        }
        ((oee)o).d();
        ((oee)o).d();
        ((oee)o).d();
        agot.H(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        ((oee)o).e();
        ((oee)o).e();
        agot.F(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        ((oee)o).a();
        ((oee)o).a();
        ((oee)o).a();
        agot.H(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        ((oee)o).b();
        ((oee)o).b();
        agot.F(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        ((oee)o).c();
        ((oee)o).c();
        ((oee)o).c();
        agot.H(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        ((oee)o).f();
        ((oee)o).f();
        ((oee)o).getClass();
        return (oee)o;
    }
    
    public static oef d(final atjj atjj) {
        return new oef(atjj);
    }
    
    public final oee b() {
        return c((Map)((arje)this.a).a);
    }
}
