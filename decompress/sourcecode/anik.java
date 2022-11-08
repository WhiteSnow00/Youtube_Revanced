import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anik extends agzi implements ahax
{
    public static final anik a;
    private static volatile ahbe k;
    public int b;
    public anip c;
    public apmc d;
    public ahvs e;
    public aixw f;
    public anpq g;
    public aiwc h;
    public amfe i;
    public aorv j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(anik.class, a = new anik());
    }
    
    private anik() {
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
                final ahbe k;
                if ((k = anik.k) == null) {
                    synchronized (anik.class) {
                        if (anik.k == null) {
                            anik.k = (ahbe)new agzb((agzi)anik.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anik.a;
            }
            case 4: {
                return new agza((agzi)anik.a);
            }
            case 3: {
                return new anik();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anik.a, "\u0001\b\u0000\u0001\ue1d6\u181e\uf6ce\u6df8\b\u0000\u0000\b\ue1d6\u181e\u1409\u0001\ue108\u196e\u1409\u0000\ue592\u1be6\u1409\u0006\uee1d\u1f0d\u1409\u0002\uf5b1\u2f1e\u1409\u0003\uecec\u49a8\u1409\u0004\uf72c\u4c0d\u1409\u0005\uf6ce\u6df8\u1409\u0007", new Object[] { "b", "d", "c", "i", "e", "f", "g", "h", "j" });
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
