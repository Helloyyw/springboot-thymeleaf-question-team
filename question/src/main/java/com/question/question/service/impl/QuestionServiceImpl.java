package com.question.question.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.question.question.bean.Question;
import com.question.question.dao.QuestionMapper;
import com.question.question.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyw
 * @since 2020-04-11
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}
