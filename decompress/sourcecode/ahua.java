import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahua extends agzi implements ahax
{
    public static final ahua a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aibc g;
    private aibc h;
    private aioe i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahua.class, a = new ahua());
    }
    
    private ahua() {
        this.k = 2;
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
                if ((b2 = ahua.b) == null) {
                    synchronized (ahua.class) {
                        if (ahua.b == null) {
                            ahua.b = (ahbe)new agzb((agzi)ahua.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahua.a;
            }
            case 4: {
                return new agza((agzi)ahua.a);
            }
            case 3: {
                return new ahua();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahua.a, "\u0001\u0007\u0000\u0001\u0003\f\u0007\u0000\u0000\u0007\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\f\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
