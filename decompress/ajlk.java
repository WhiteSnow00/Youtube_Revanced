import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlk extends ahcz implements aheo
{
    public static final ajlk a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public ajjs e;
    private byte g;
    
    static {
        final ajlk a2 = new ajlk();
        ahcz.registerDefaultInstance(ajlk.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 264, ahgc.k, ajlk.class);
    }
    
    private ajlk() {
        this.g = 2;
        this.d = "";
        final ahbt b = ahbt.b;
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
                if ((f = ajlk.f) == null) {
                    synchronized (ajlk.class) {
                        if (ajlk.f == null) {
                            ajlk.f = (ahev)new ahcs((ahcz)ajlk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajlk.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlk.a);
            }
            case 3: {
                return new ajlk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlk.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
