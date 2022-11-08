// 
// Decompiled by Procyon v0.6.0
// 

public final class asgj
{
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
                    final asgi asgi = (asgi)clazz.asSubclass(asgi.class).getConstructor(asgk.class).newInstance(asgi.a);
                    break Label_0065;
                }
                finally {}
            }
            final Throwable t3 = null;
            t2 = t;
            t = t3;
        }
        if (t == null) {
            new asgi(asgi.a);
        }
        if (t2 == null) {
            return;
        }
        try {
            if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                final Class<?> forName = Class.forName("java.util.logging.Logger");
                final Object invoke = forName.getMethod("getLogger", String.class).invoke(null, asgj.class.getName());
                final Class<?> forName2 = Class.forName("java.util.logging.Level");
                forName.getMethod("log", forName2, String.class, Throwable.class).invoke(invoke, forName2.getField("FINE").get(null), "Error during PerfMark.<clinit>", t2);
            }
        }
        finally {}
    }
    
    private asgj() {
    }
}
