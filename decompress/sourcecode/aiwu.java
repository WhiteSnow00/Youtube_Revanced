import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwu extends agzi implements ahax
{
    public static final aiwu a;
    private static volatile ahbe b;
    private int c;
    private aixe d;
    private aiww e;
    private aixf f;
    private aiwy g;
    private aiwn h;
    private aiwx i;
    private aixc j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiwu.class, a = new aiwu());
    }
    
    private aiwu() {
        this.k = 2;
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
                if ((b2 = aiwu.b) == null) {
                    synchronized (aiwu.class) {
                        if (aiwu.b == null) {
                            aiwu.b = (ahbe)new agzb((agzi)aiwu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwu.a;
            }
            case 4: {
                return new agza((agzi)aiwu.a);
            }
            case 3: {
                return new aiwu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwu.a, "\u0001\u0007\u0000\u0001\ufbd0\u23dd\uf6dd\u641c\u0007\u0000\u0000\u0007\ufbd0\u23dd\u1409\u0005\uf354\u2406\u1409\u0000\uf379\u2406\u1409\u0002\uf2ec\u2eca\u1409\u0006\ued84\u40f2\u1409\u0001\ue1ea\u62ff\u1409\u0003\uf6dd\u641c\u1409\u0004", new Object[] { "c", "i", "d", "f", "j", "e", "g", "h" });
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
