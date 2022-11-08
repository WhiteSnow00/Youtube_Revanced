import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgr extends agzi implements ahax
{
    public static final ajgr a;
    public static final agzg b;
    private static volatile ahbe k;
    public int c;
    public int d;
    public Object e;
    public aqcz f;
    public String g;
    public String h;
    public String i;
    public String j;
    private byte l;
    
    static {
        final ajgr a2 = new ajgr();
        agzi.registerDefaultInstance(ajgr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 378762193, ahcm.k, ajgr.class);
    }
    
    private ajgr() {
        this.d = 0;
        this.l = 2;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
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
                if ((k = ajgr.k) == null) {
                    synchronized (ajgr.class) {
                        if (ajgr.k == null) {
                            ajgr.k = (ahbe)new agzb((agzi)ajgr.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajgr.a;
            }
            case 4: {
                return new agza((agzi)ajgr.a);
            }
            case 3: {
                return new ajgr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgr.a, "\u0001\u0007\u0001\u0001\u0002\t\u0007\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u103b\u0000\u0005\u1008\u0006\u0006\u1008\u0007\b\u1008\b\t\u143c\u0000", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", aqbm.class });
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
