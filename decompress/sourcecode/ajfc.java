import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfc extends agzi implements ahax
{
    public static final ajfc a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public aqcz d;
    public String e;
    private aqfp g;
    private aqfp h;
    private byte i;
    
    static {
        final ajfc a2 = new ajfc();
        agzi.registerDefaultInstance(ajfc.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 353892150, ahcm.k, ajfc.class);
    }
    
    private ajfc() {
        this.i = 2;
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
                final ahbe f;
                if ((f = ajfc.f) == null) {
                    synchronized (ajfc.class) {
                        if (ajfc.f == null) {
                            ajfc.f = (ahbe)new agzb((agzi)ajfc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajfc.a;
            }
            case 4: {
                return new agza((agzi)ajfc.a);
            }
            case 3: {
                return new ajfc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfc.a, "\u0001\u0004\u0000\u0001\u0002\u000e\u0004\u0000\u0000\u0003\u0002\u1008\u0014\u000b\u1409\u0001\r\u1409\b\u000e\u1409\n", new Object[] { "c", "e", "d", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
