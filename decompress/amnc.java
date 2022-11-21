import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnc extends ahcz implements aheo
{
    public static final amnc a;
    private static volatile ahev k;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public aisc f;
    public amnb g;
    public amna h;
    public ajws i;
    public ahbt j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(amnc.class, a = new amnc());
    }
    
    private amnc() {
        this.m = 2;
        emptyProtobufList();
        this.j = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = amnc.k) == null) {
                    synchronized (amnc.class) {
                        if (amnc.k == null) {
                            amnc.k = (ahev)new ahcs((ahcz)amnc.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amnc.a;
            }
            case 4: {
                return new ahcr((ahcz)amnc.a);
            }
            case 3: {
                return new amnc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnc.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\b\u0006\u1409\t\u0007\u1409\u0004\b\u1409\u0005\n\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "j", "l", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
