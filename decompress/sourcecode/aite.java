import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aite extends agzi implements ahax
{
    public static final aite a;
    private static volatile ahbe g;
    public int b;
    public aiia c;
    public anie d;
    public anif e;
    public akbh f;
    private anpg h;
    private amjz i;
    private aizg j;
    private apmv k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(aite.class, a = new aite());
    }
    
    private aite() {
        this.l = 2;
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
                final ahbe g;
                if ((g = aite.g) == null) {
                    synchronized (aite.class) {
                        if (aite.g == null) {
                            aite.g = (ahbe)new agzb((agzi)aite.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aite.a;
            }
            case 4: {
                return new agza((agzi)aite.a);
            }
            case 3: {
                return new aite();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aite.a, "\u0001\b\u0000\u0001\uf7c4\u1724\uf8fb\u2d19\b\u0000\u0000\b\uf7c4\u1724\u1409\u0001\uf1d2\u172b\u1409\u0000\ue391\u2289\u1409\u0002\uea90\u2a84\u1409\u0006\uf920\u2b04\u1409\u0003\uefee\u2c79\u1409\u0004\uf08e\u2cd5\u1409\u0005\uf8fb\u2d19\u1409\u0007", new Object[] { "b", "d", "c", "e", "k", "h", "i", "j", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
