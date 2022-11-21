import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkh extends ahcz implements aheo
{
    public static final ajkh a;
    public static final ahcx b;
    private static volatile ahev o;
    public int c;
    public String d;
    public aowb e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public ahdp m;
    public ahbt n;
    private byte p;
    
    static {
        final ajkh a2 = new ajkh();
        ahcz.registerDefaultInstance(ajkh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 199, ahgc.k, ajkh.class);
    }
    
    private ajkh() {
        this.p = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = ahcz.emptyProtobufList();
        this.n = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = ajkh.o) == null) {
                    synchronized (ajkh.class) {
                        if (ajkh.o == null) {
                            ajkh.o = (ahev)new ahcs((ahcz)ajkh.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajkh.a;
            }
            case 4: {
                return new ahcr((byte[][][])null, (int[])null);
            }
            case 3: {
                return new ajkh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkh.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u001b\u000b\u100a\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", ajht.class, "n" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
