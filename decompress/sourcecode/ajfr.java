import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfr extends agzi implements ahax
{
    public static final ajfr a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajfr a2 = new ajfr();
        agzi.registerDefaultInstance(ajfr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 380917126, ahcm.k, ajfr.class);
    }
    
    private ajfr() {
        this.f = 2;
        this.d = "";
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
                final ahbe e;
                if ((e = ajfr.e) == null) {
                    synchronized (ajfr.class) {
                        if (ajfr.e == null) {
                            ajfr.e = (ahbe)new agzb((agzi)ajfr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfr.a;
            }
            case 4: {
                return new agza((agzi)ajfr.a);
            }
            case 3: {
                return new ajfr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
