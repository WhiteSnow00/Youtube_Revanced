import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aora extends agzi implements ahax
{
    public static final aora a;
    private static volatile ahbe o;
    public int b;
    public aoqo c;
    public aoqp d;
    public aorb e;
    public aoqy f;
    public aoqz g;
    public aoqu h;
    public ahyj i;
    public ahyo j;
    public aorc k;
    public aoqx l;
    public aore m;
    public aoqt n;
    private aoqr p;
    private aoqs q;
    private aord r;
    private aoqq s;
    private anic t;
    private aoqw u;
    private aoqv v;
    private aowd w;
    private byte x;
    
    static {
        agzi.registerDefaultInstance(aora.class, a = new aora());
    }
    
    private aora() {
        this.x = 2;
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
                final ahbe o3;
                if ((o3 = aora.o) == null) {
                    synchronized (aora.class) {
                        if (aora.o == null) {
                            aora.o = (ahbe)new agzb((agzi)aora.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aora.a;
            }
            case 4: {
                return new agza((agzi)aora.a);
            }
            case 3: {
                return new aora();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aora.a, "\u0001\u0014\u0000\u0001\uffc6\u1847\ue299\ub91e\u0014\u0000\u0000\u0011\uffc6\u1847\u1409\u000b\uefe2\u3143\u1009\u0003\uf2ff\u3319\u1409\b\ue25a\u3324\u1409\u0004\ue7fe\u3447\u1409\u0001\ue6ed\u3496\u1009\u0007\ufdc1\u353e\u1409\t\ue678\u36f8\u1409\u0000\uefc0\u3a0a\u1409\u000e\ue95e\u3d25\u1409\u0005\ufe27\u4de7\u1009\u000f\ue4f3\u4e74\u1409\n\ueb7a\u50c5\u1409\u0010\ue923\u5e65\u1409\u0006\ue0bf\u6ce2\u1409\u0011\ue8eb\u9461\u1409\u0002\uf23c\u98cf\u1409\f\uf497\uaf50\u1409\u0014\ufd22\ub8bf\u1409\u0015\ue299\ub91e\u1409\u0016", new Object[] { "b", "i", "e", "g", "q", "d", "f", "t", "c", "k", "r", "l", "h", "m", "s", "u", "p", "j", "v", "n", "w" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
