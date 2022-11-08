import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuj extends agzi implements ahax
{
    public static final aiuj a;
    private static volatile ahbe h;
    public int b;
    public aisr c;
    public ajkj d;
    public amjs e;
    public ahjs f;
    public ahzq g;
    private aiui i;
    private ahsz j;
    private aobq k;
    private amix l;
    private aolx m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aiuj.class, a = new aiuj());
    }
    
    private aiuj() {
        this.n = 2;
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
                final ahbe h;
                if ((h = aiuj.h) == null) {
                    synchronized (aiuj.class) {
                        if (aiuj.h == null) {
                            aiuj.h = (ahbe)new agzb((agzi)aiuj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aiuj.a;
            }
            case 4: {
                return new agza((agzi)aiuj.a);
            }
            case 3: {
                return new aiuj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuj.a, "\u0001\n\u0000\u0001\uf549\u1a78\ue79e\uac6b\n\u0000\u0000\t\uf549\u1a78\u1409\u0000\ufc1b\u1efe\u1409\u0001\ufc81\u3692\u1409\u0002\ue6b3\u4926\u1409\u0003\uf492\u4933\u1409\u0005\uf7ce\u4a70\u1409\u0004\uf8ac\u4f57\u1409\u0006\uf48b\u54a1\u1409\u0007\ufa96\u7edb\u1009\b\ue79e\uac6b\u1409\t", new Object[] { "b", "i", "j", "k", "c", "d", "l", "e", "m", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
