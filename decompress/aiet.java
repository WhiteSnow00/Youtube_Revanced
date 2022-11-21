import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiet extends ahcz implements aheo
{
    public static final aiet a;
    private static volatile ahev e;
    public int b;
    public aies c;
    public aifb d;
    private alqa f;
    private aieu g;
    private aiex h;
    private aobi i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aiet.class, a = new aiet());
    }
    
    private aiet() {
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aiet.e) == null) {
                    synchronized (aiet.class) {
                        if (aiet.e == null) {
                            aiet.e = (ahev)new ahcs((ahcz)aiet.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiet.a;
            }
            case 4: {
                return new ahcr((ahcz)aiet.a);
            }
            case 3: {
                return new aiet();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiet.a, "\u0001\u0006\u0000\u0001\uea9e\u1ca7\ue3e9\ud798\u0006\u0000\u0000\u0006\uea9e\u1ca7\u1409\u0002\ueb11\u1f11\u1409\u0000\ue5d8\u2622\u1409\u0001\ue110\ua215\u1409\u0004\uf2c2\ua4a8\u1409\u0005\ue3e9\ud798\u1409\u0006", new Object[] { "b", "f", "c", "d", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
