import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxd extends ahbc implements ahbd
{
    public static final aoxd a;
    public static final ahbf b;
    private static volatile ahdd r;
    public int c;
    public String d;
    public int e;
    public ahbx f;
    public int g;
    public ahbx h;
    public String i;
    public long j;
    public int k;
    public String m;
    public ahbx n;
    public int o;
    public boolean p;
    public boolean q;
    private byte s;
    
    static {
        final aoxd a2 = new aoxd();
        ahbh.registerDefaultInstance((Class)aoxd.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 120, ahek.k, (Class)aoxd.class);
    }
    
    private aoxd() {
        this.s = 2;
        this.d = "";
        this.f = emptyProtobufList();
        this.h = ahbh.emptyProtobufList();
        this.i = "";
        this.m = "";
        this.n = ahbh.emptyProtobufList();
    }
    
    public final void a() {
        final ahbx h = this.h;
        if (!h.c()) {
            this.h = ahbh.mutableCopy(h);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = aoxd.r) == null) {
                    synchronized (aoxd.class) {
                        if (aoxd.r == null) {
                            aoxd.r = (ahdd)new ahba((ahbh)aoxd.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aoxd.a;
            }
            case 4: {
                return new ahbb((ahbc)aoxd.a);
            }
            case 3: {
                return new aoxd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxd.a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001b\u0004\u100c\u0002\u0005\u001a\u0006\u1008\u0003\u0007\u1002\u0004\b\u100c\u0005\t\u1008\u0006\n\u001a\u000b\u1004\u0007\f\u1007\b\r\u1007\t", new Object[] { "c", "d", "e", aowy.a(), "f", aoln.class, "g", aowz.a(), "h", "i", "j", "k", amwz.a(), "m", "n", "o", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
