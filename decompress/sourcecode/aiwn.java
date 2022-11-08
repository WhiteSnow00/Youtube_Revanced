import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwn extends agzi implements ahax
{
    public static final aiwn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private amer e;
    private aiwt f;
    private aiwp g;
    private aiws h;
    private ahfw i;
    private aioe j;
    private aioe k;
    private aioe l;
    private ajsq m;
    private ajsq n;
    private aioe o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(aiwn.class, a = new aiwn());
    }
    
    private aiwn() {
        this.p = 2;
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aiwn.b) == null) {
                    synchronized (aiwn.class) {
                        if (aiwn.b == null) {
                            aiwn.b = (ahbe)new agzb((agzi)aiwn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwn.a;
            }
            case 4: {
                return new agza((agzi)aiwn.a);
            }
            case 3: {
                return new aiwn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwn.a, "\u0001\f\u0000\u0001\u0005\u001b\f\u0000\u0000\f\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\f\u1409\u000b\r\u1409\f\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u1409\u0010\u0015\u1409\u0014\u0017\u1409\u0016\u0018\u1409\u0017\u001b\u1409\u001a", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
