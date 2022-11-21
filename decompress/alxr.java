import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxr extends ahcz implements aheo
{
    public static final alxr a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public alji d;
    public alxw e;
    private byte g;
    
    static {
        final alxr a2 = new alxr();
        ahcz.registerDefaultInstance(alxr.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 375538462, ahgc.k, alxr.class);
    }
    
    private alxr() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alxr.f) == null) {
                    synchronized (alxr.class) {
                        if (alxr.f == null) {
                            alxr.f = (ahev)new ahcs((ahcz)alxr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alxr.a;
            }
            case 4: {
                return new ahcr((ahcz)alxr.a);
            }
            case 3: {
                return new alxr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxr.a, "\u0001\u0002\u0000\u0001\u0001\u03e7\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u03e7\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
