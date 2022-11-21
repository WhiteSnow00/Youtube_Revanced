import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlg extends ahcz implements aheo
{
    public static final ahlg a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public aisc d;
    public ahbt e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ahlg.class, a = new ahlg());
    }
    
    private ahlg() {
        this.h = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahlg.f) == null) {
                    synchronized (ahlg.class) {
                        if (ahlg.f == null) {
                            ahlg.f = (ahev)new ahcs((ahcz)ahlg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahlg.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlg.a);
            }
            case 3: {
                return new ahlg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
