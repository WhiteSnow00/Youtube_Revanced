import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgq extends agzi implements ahax
{
    public static final ajgq a;
    public static final agzg b;
    private static volatile ahbe k;
    public int c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public String j;
    private byte l;
    
    static {
        final ajgq a2 = new ajgq();
        agzi.registerDefaultInstance(ajgq.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 372486289, ahcm.k, ajgq.class);
    }
    
    private ajgq() {
        this.l = 2;
        this.d = "";
        this.f = "";
        this.g = "";
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
                if ((k = ajgq.k) == null) {
                    synchronized (ajgq.class) {
                        if (ajgq.k == null) {
                            ajgq.k = (ahbe)new agzb((agzi)ajgq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajgq.a;
            }
            case 4: {
                return new agza((agzi)ajgq.a);
            }
            case 3: {
                return new ajgq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgq.a, "\u0001\u0007\u0000\u0001\u0003\r\u0007\u0000\u0000\u0000\u0003\u1008\u0002\u0006\u1007\u0005\u0007\u1008\u0006\b\u1008\u0007\n\u1007\t\u000b\u1008\u000b\r\u1007\n", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
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
