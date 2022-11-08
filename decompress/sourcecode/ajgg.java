import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgg extends agzi implements ahax
{
    public static final ajgg a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public aqcz d;
    public String e;
    public ajgf f;
    public boolean g;
    public boolean h;
    public ajeg i;
    private byte k;
    
    static {
        final ajgg a2 = new ajgg();
        agzi.registerDefaultInstance(ajgg.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 323685881, ahcm.k, ajgg.class);
    }
    
    private ajgg() {
        this.k = 2;
        this.e = "";
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
                final ahbe j;
                if ((j = ajgg.j) == null) {
                    synchronized (ajgg.class) {
                        if (ajgg.j == null) {
                            ajgg.j = (ahbe)new agzb((agzi)ajgg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajgg.a;
            }
            case 4: {
                return new agza((agzi)ajgg.a);
            }
            case 3: {
                return new ajgg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgg.a, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0001\u0002\u1008\u0003\u0007\u1007\b\b\u1007\t\t\u1009\n\n\u1409\u0001\f\u1009\u0007", new Object[] { "c", "e", "g", "h", "i", "d", "f" });
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
