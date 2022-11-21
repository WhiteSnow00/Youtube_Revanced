import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkv extends ahcz implements aheo
{
    public static final ajkv a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final ajkv a2 = new ajkv();
        ahcz.registerDefaultInstance(ajkv.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajjs.a, a2, (MessageLite)a2, null, 379568079, ahgc.k, ajkv.class);
    }
    
    private ajkv() {
        this.c = 0;
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajkv.e) == null) {
                    synchronized (ajkv.class) {
                        if (ajkv.e == null) {
                            ajkv.e = (ahev)new ahcs((ahcz)ajkv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajkv.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkv.a);
            }
            case 3: {
                return new ajkv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkv.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u143c\u0000", new Object[] { "d", "c", aqgs.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
