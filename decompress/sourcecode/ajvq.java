import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvq extends agzi implements ahax
{
    public static final ajvq a;
    private static volatile ahbe l;
    public int b;
    public int c;
    public Object d;
    public akjd e;
    public String f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public long k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(ajvq.class, a = new ajvq());
    }
    
    private ajvq() {
        this.c = 0;
        this.m = 2;
        this.f = "";
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
                final ahbe l;
                if ((l = ajvq.l) == null) {
                    synchronized (ajvq.class) {
                        if (ajvq.l == null) {
                            ajvq.l = (ahbe)new agzb((agzi)ajvq.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajvq.a;
            }
            case 4: {
                return new agza((agzi)ajvq.a);
            }
            case 3: {
                return new ajvq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvq.a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u1007\u0004\u0005\u1007\u0005\u0006\u100c\u0006\b\u103b\u0000\t\u1007\b\u000b\u1002\n", new Object[] { "d", "c", "b", "e", "f", "g", "h", "i", amuv.a(), "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
