package com.gms.web.service;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.ArticleDTO;
import com.gms.web.domain.MemberDTO;

public interface BoardService {
	public void add(ArticleDTO p);
	public List<?> list(Map<?,?> p);
	public List<?> search(Map<?,?> p);
	public ArticleDTO retrieve(String p);
	public int count(Map<?,?> p) ;
	public void modify(Map<?,?> p) ;
	public void remove(Map<?,?> p) ;
	public boolean login(ArticleDTO p) ;
}
