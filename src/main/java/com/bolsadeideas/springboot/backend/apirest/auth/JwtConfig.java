package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "algunas.clave.secreta.12345678";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoFQxz3vqd/VhPtA0SKA8\r\n"
			+ "X30w8oJTNoN7sR9tlMDdKVcL6xAIprue7HdSR4ImpysfwR2nlLDAQrEatGW72/GH\r\n"
			+ "3haCs5WuhOvCLCfyQy90eI9Vdh1f7M0w4p5suRPd8TdnmKSyOG+ps6MykuzStbMh\r\n"
			+ "/LU2V+xZASyZsHZG3X390FAizKoZAk8dPbopceq+semNt9Fo1OZbPvh1U0LSBvm+\r\n"
			+ "WEzWYyrLQ8p8F2khQpgawhh3hePGmr9d28yrWuUenwmKTA8KFCSaq+iZIGdWQuLt\r\n"
			+ "ka7Pfigf0lFv3S+LbJMSQgxSMVxCaIhI0JmH49NciPQtDSfgmV9GCc2ZBbtBv/6y\r\n"
			+ "WwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpAIBAAKCAQEAoFQxz3vqd/VhPtA0SKA8X30w8oJTNoN7sR9tlMDdKVcL6xAI\r\n"
			+ "prue7HdSR4ImpysfwR2nlLDAQrEatGW72/GH3haCs5WuhOvCLCfyQy90eI9Vdh1f\r\n"
			+ "7M0w4p5suRPd8TdnmKSyOG+ps6MykuzStbMh/LU2V+xZASyZsHZG3X390FAizKoZ\r\n"
			+ "Ak8dPbopceq+semNt9Fo1OZbPvh1U0LSBvm+WEzWYyrLQ8p8F2khQpgawhh3hePG\r\n"
			+ "mr9d28yrWuUenwmKTA8KFCSaq+iZIGdWQuLtka7Pfigf0lFv3S+LbJMSQgxSMVxC\r\n"
			+ "aIhI0JmH49NciPQtDSfgmV9GCc2ZBbtBv/6yWwIDAQABAoIBAQCP1JhO44KnlQll\r\n"
			+ "WVDeKmme3GeR1xqhl/jaIDClNxPw5zc47Exmj4B18GFu5zKX21cEXv8cpCgGbG1h\r\n"
			+ "kraiDJ7vvNAKHWjPs9Sg2kE6xpK9KRDpAlcwz69gTfGJY2pC4IpeZLnBaWMbVXek\r\n"
			+ "WTJ6cLY3x7V10QDTzdgedy0BvOp6+k161w15bT+v1ou5raG+herTYl4w3yJa43/R\r\n"
			+ "X5E7MwatR3AFeiFR6/EBZQmTASexX6r08wT2Wc+B/oZk7Rv0izvIcC/Urrxw1O6D\r\n"
			+ "ifjNgJnCl4jU2iXpQUL7nku9O1Z4rsAyI1KWs4OQpg+kjVpTijtWQvqjdrJO1ARQ\r\n"
			+ "4MpGe/eRAoGBAM7JRlsk+yJyoo3xn1P7wjmOM+ar3OjziOht5w0G/z0n8NWdq9dE\r\n"
			+ "3TBKSGFM3kGDyVj+2FnYKJiQl3ArS7gy6ewKkHzZxxOPVoHJ/GnmZl5N++QES4PT\r\n"
			+ "uRpWPNP3EWQ0T4ESAjQg91ZpIjtyG8y3019VVrHyTZUcCqN3K3VrFzOJAoGBAMZ8\r\n"
			+ "ccYpZNEsyItv85XRasiPL62uGgbIliXXAVH5dYatpN2q9L7Uf3XQZvMI/8VH+nHj\r\n"
			+ "G1plhr5Gi1xyN5qa9iI8IUlfLH1UV782yUUYPHNiHu8hxVQCFQIyInbBu13N9+0u\r\n"
			+ "iqISXYsvi760vf93BwFQWY3BpWN8Z9vXUQs9panDAoGAd3E9SWJYCTLMAE9jp6AR\r\n"
			+ "NSuVgRUeehRJrW/l+Nlkzw9mBg2X97UYSk9t9X3wF0mnINe7YlIASPej8a+gghou\r\n"
			+ "kiAcC3HDkuHFpxxjx0vFL42+BJwSfmfqUHMlmY3ppsascbJUQYYVN/1sP4gO1LYN\r\n"
			+ "ytBBTnHWLF3RK1CncqBT+3kCgYBS4xUAE7kuQO1ejVnDbriRGHpopRPpUUqicq7y\r\n"
			+ "dKJHo6v9ha6/Ii44HNdhFpj44Z4MgTKjBVLHkt4PtQLTZXLzyPh9k2kYzWf3SgGz\r\n"
			+ "APP9mzQf2JJ3CoeLazRJM43zFlg6i/0IwXKe9TP+Z6wQSrx6J/u93ugaK5GTlM8b\r\n"
			+ "Spsr0QKBgQCbneoS8AZWxxHjbtpx0gn/WRABsHc8eNbB0jXd7xbY4XcZlOSWu5Qf\r\n"
			+ "5Q9opFQjfYJk2sLu1shh/sa3q/cfIs/7cfD0LwwjA/tbeJnvPvgzbxu3v2O2Chlc\r\n"
			+ "4CZ6sVchvQtYWT2xRXkJu+7W5Z/kQPVXXJmKa0dNOh8OVuYeEH5fQQ==\r\n"
			+ "-----END RSA PRIVATE KEY-----";
}
