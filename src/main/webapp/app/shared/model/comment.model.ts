import { IBook } from 'app/shared/model/book.model';

export interface IComment {
  id?: number;
  nickName?: string | null;
  commentText?: string | null;
  book?: IBook | null;
}

export const defaultValue: Readonly<IComment> = {};
