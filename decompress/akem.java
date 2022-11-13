import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akem extends ahbh implements ahcw
{
    public static final akem a;
    private static volatile ahdd d;
    public int b;
    public akeq c;
    private akez e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akem.class, (ahbh)(a = new akem()));
    }
    
    private akem() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akem.d) == null) {
                    synchronized (akem.class) {
                        if (akem.d == null) {
                            akem.d = (ahdd)new ahba((ahbh)akem.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akem.a;
            }
            case 4: {
                return new ahaz((ahbh)akem.a);
            }
            case 3: {
                return new akem();
            }
            case 2: {
                return newMessageInfo((MessageLite)akem.a, "\u0001\u0002\u0000\u0001\ue8f7\u1d77\ue646\u3601\u0002\u0000\u0000\u0002\ue8f7\u1d77\u1409\u0000\ue646\u3601\u1409\u0001", new Object[] { "b", "e", "c" });
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
