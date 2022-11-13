// 
// Decompiled by Procyon v0.6.0
// 

public final class asgy
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
                    final asgx asgx = (asgx)clazz.asSubclass(asgx.class).getConstructor(asgz.class).newInstance(asgx.a);
                    break Label_0065;
                }
                finally {}
            }
            final Throwable t3 = null;
            t2 = t;
            t = t3;
        }
        if (t == null) {
            new asgx(asgx.a);
        }
        if (t2 == null) {
            return;
        }
        try {
            if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                final Class<?> forName = Class.forName("java.util.logging.Logger");
                final Object invoke = forName.getMethod("getLogger", String.class).invoke(null, asgy.class.getName());
                final Class<?> forName2 = Class.forName("java.util.logging.Level");
                forName.getMethod("log", forName2, String.class, Throwable.class).invoke(invoke, forName2.getField("FINE").get(null), "Error during PerfMark.<clinit>", t2);
            }
        }
        finally {}
    }
    
    private asgy() {
    }
}
