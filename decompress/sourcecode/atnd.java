import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atnd
{
    public static final String a(final atne atne) {
        String s2;
        final String s = s2 = atne.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
    
    public static asgt b(final Object o, final asjc asjc) {
        final assc assc = new assc(o, asjc);
        final asjc j = aulo.j;
        return assc;
    }
    
    public static boolean c(aujo aujo, final aujp aujp, final asjc asjc) {
        if (aujo instanceof Callable) {
            try {
                final Object call = ((Callable)aujo).call();
                if (call == null) {
                    athe.d(aujp);
                    return true;
                }
                try {
                    aujo = (aujo)asjc.a(call);
                    asjv.b((Object)aujo, "The mapper returned a null Publisher");
                    if (aujo instanceof Callable) {
                        try {
                            final Object call2 = ((Callable)aujo).call();
                            if (call2 == null) {
                                athe.d(aujp);
                                return true;
                            }
                            aujp.f((aujq)new athf(aujp, call2));
                            return true;
                        }
                        finally {
                            return;
                        }
                    }
                    aujo.as(aujp);
                    return true;
                }
                finally {
                    return;
                }
            }
            finally {
                final Throwable t;
                asey.d(t);
                athe.f(t, aujp);
                return true;
            }
        }
        return false;
    }
}
