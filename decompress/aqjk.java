import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjk extends ahcu implements ahcv
{
    public static final aqjk a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public aqjj e;
    private byte g;
    
    static {
        final aqjk a2 = new aqjk();
        ahcz.registerDefaultInstance(aqjk.class, (ahcz)(a = a2));
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjq.a, a2, (MessageLite)a2, null, 255496645, ahgc.k, aqjk.class);
    }
    
    private aqjk() {
        this.g = 2;
        this.d = "";
    }
    
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
                if ((f = aqjk.f) == null) {
                    synchronized (aqjk.class) {
                        if (aqjk.f == null) {
                            aqjk.f = (ahev)new ahcs((ahcz)aqjk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqjk.a;
            }
            case 4: {
                return new ahct((ahcu)aqjk.a);
            }
            case 3: {
                return new aqjk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjk.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e" });
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
