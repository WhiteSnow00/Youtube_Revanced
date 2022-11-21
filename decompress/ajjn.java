import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjn extends ahcz implements aheo
{
    public static final ajjn a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public int e;
    private byte g;
    
    static {
        final ajjn a2 = new ajjn();
        ahcz.registerDefaultInstance(ajjn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 384293593, ahgc.k, ajjn.class);
    }
    
    private ajjn() {
        this.g = 2;
        this.d = "";
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
                if ((f = ajjn.f) == null) {
                    synchronized (ajjn.class) {
                        if (ajjn.f == null) {
                            ajjn.f = (ahev)new ahcs((ahcz)ajjn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajjn.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjn.a);
            }
            case 3: {
                return new ajjn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjn.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "c", "d", "e", ajgj.m });
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
