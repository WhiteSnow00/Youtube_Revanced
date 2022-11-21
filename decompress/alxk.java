import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxk extends ahcz implements aheo
{
    public static final alxk a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final alxk a2 = new alxk();
        ahcz.registerDefaultInstance(alxk.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 260591906, ahgc.k, alxk.class);
    }
    
    private alxk() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = alxk.g) == null) {
                    synchronized (alxk.class) {
                        if (alxk.g == null) {
                            alxk.g = (ahev)new ahcs((ahcz)alxk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alxk.a;
            }
            case 4: {
                return new ahcr((ahcz)alxk.a);
            }
            case 3: {
                return new alxk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
