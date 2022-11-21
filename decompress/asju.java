// 
// Decompiled by Procyon v0.6.0
// 

public final class asju
{
    public static final int a = 0;
    
    static {
        Class clazz;
        try {
            Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
        }
        finally {
            clazz = null;
        }
        final Throwable t2;
        Throwable t = t2;
        Label_0065: {
            if (clazz != null) {
                try {
                    final asjt asjt = (asjt)clazz.asSubclass(asjt.class).getConstructor(asjv.class).newInstance(asjt.a);
                    break Label_0065;
                }
                finally {}
            }
            final Throwable t3 = null;
            t2 = t;
            t = t3;
        }
        if (t == null) {
            new asjt(asjt.a);
        }
        if (t2 == null) {
            return;
        }
        try {
            if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                final Class<?> forName = Class.forName("java.util.logging.Logger");
                final Object invoke = forName.getMethod("getLogger", String.class).invoke(null, asju.class.getName());
                final Class<?> forName2 = Class.forName("java.util.logging.Level");
                forName.getMethod("log", forName2, String.class, Throwable.class).invoke(invoke, forName2.getField("FINE").get(null), "Error during PerfMark.<clinit>", t2);
            }
        }
        finally {}
    }
    
    private asju() {
    }
}
