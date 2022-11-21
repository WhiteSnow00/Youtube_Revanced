import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleq extends ahcz implements aheo
{
    public static final aleq a;
    private static volatile ahev g;
    public int b;
    public aknj c;
    public String d;
    public int e;
    public aler f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aleq.class, a = new aleq());
    }
    
    private aleq() {
        this.h = 2;
        this.d = "";
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
                final ahev g;
                if ((g = aleq.g) == null) {
                    synchronized (aleq.class) {
                        if (aleq.g == null) {
                            aleq.g = (ahev)new ahcs((ahcz)aleq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aleq.a;
            }
            case 4: {
                return new ahcr((ahcz)aleq.a);
            }
            case 3: {
                return new aleq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aleq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1008\u0001\u0004\u100c\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", akyi.q, "f" });
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
